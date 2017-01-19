package com.hellosign.sdk;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.ArgumentMatchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.hellosign.sdk.http.HttpClient;
import com.hellosign.sdk.resource.AbstractRequest;
import com.hellosign.sdk.resource.Account;
import com.hellosign.sdk.resource.ApiApp;
import com.hellosign.sdk.resource.EmbeddedRequest;
import com.hellosign.sdk.resource.EmbeddedResponse;
import com.hellosign.sdk.resource.SignatureRequest;
import com.hellosign.sdk.resource.Team;
import com.hellosign.sdk.resource.Template;
import com.hellosign.sdk.resource.TemplateDraft;
import com.hellosign.sdk.resource.TemplateSignatureRequest;
import com.hellosign.sdk.resource.UnclaimedDraft;
import com.hellosign.sdk.resource.support.ApiAppList;
import com.hellosign.sdk.resource.support.CustomField;
import com.hellosign.sdk.resource.support.Document;
import com.hellosign.sdk.resource.support.FormField;
import com.hellosign.sdk.resource.support.OauthData;
import com.hellosign.sdk.resource.support.Signature;
import com.hellosign.sdk.resource.support.SignatureRequestList;
import com.hellosign.sdk.resource.support.TemplateList;
import com.hellosign.sdk.resource.support.TemplateRole;
import com.hellosign.sdk.resource.support.WhiteLabelingOptions;
import com.hellosign.sdk.resource.support.types.FieldType;
import com.hellosign.sdk.resource.support.types.UnclaimedDraftType;

/**
 * The MIT License (MIT)
 * 
 * Copyright (C) 2015 hellosign.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

public class HelloSignClientTest {

	// TODO: Make convenience method to mock response code

	@Rule
	public TestName name = new TestName();

	private HttpClient spy;
	private HelloSignClient client;

	@Before
	public void setup() throws Exception {
		spy = spy(new HttpClient());
		client = new HelloSignClient("testapikey");
		client.setHttpClient(spy);

		// Don't actually make HTTP requests
		doReturn(spy).when(spy).post(any(String.class));
		doReturn(spy).when(spy).get(any(String.class));
		doReturn(spy).when(spy).put(any(String.class));
		doReturn(spy).when(spy).delete(any(String.class));
		doReturn(spy).when(spy).options(any(String.class));

		// Return the test case's JSON response instead
		// TODO: Add instructions for autogeneration
		doReturn(getTestFileAsString(name.getMethodName() + ".json")).when(spy).getLastResponse();
	}

	protected String getTestFileAsString(String name) throws FileNotFoundException {
		String result = null;
		String url = System.getProperty("file.separator") + this.getClass().getSimpleName()
				+ System.getProperty("file.separator") + name;
		URL resource = this.getClass().getResource(url);
		if (resource != null) {
			Scanner s = new Scanner(new File(resource.getFile()));
			s.useDelimiter("\\Z");
			result = (s.hasNext() ? s.next() : "");
			s.close();
		}
		return result;
	}

	@After
	public void tearDown() {
		spy = null;
		client = null;
	}

	@Test
	public void testCreateAccount() throws Exception {
		String email = "newuser@hellosign.com";
		Account account = client.createAccount(email);
		assertNotNull(account);
		assertTrue(email.equals(account.getEmail()));
	}

	@Test(expected = HelloSignException.class)
	public void testCreateAccountExisting() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		client.createAccount("chris@hellosign.com");
	}

	@Test
	public void testCreateAccountWithOAuthData() throws Exception {
		String email = "newuser1@hellosign.com";
		Account account = client.createAccount(email);
		assertNotNull(account);
		assertTrue(email.equals(account.getEmail()));
		OauthData data = account.getOauthData();
		assertNotNull(data);
		assertNotNull(data.getAccessToken());
		assertTrue(!data.getAccessToken().isEmpty());
		assertNotNull(data.getTokenType());
		assertTrue(!data.getTokenType().isEmpty());
		assertNotNull(data.getRefreshToken());
		assertTrue(!data.getRefreshToken().isEmpty());
		assertTrue(data.getExpiresIn() > 0);
	}

	@Test
	public void testGetOauthData() throws Exception {
		String code = "testcode";
		String clientId = "testclientid";
		String secret = "testsecret";
		String state = "teststate";
		OauthData data = client.getOauthData(code, clientId, secret, state, false);
		assertNotNull(data);
		assertNotNull(data.getAccessToken());
		assertTrue(!data.getAccessToken().isEmpty());
		assertNotNull(data.getExpiresIn());
		assertTrue(data.getExpiresIn() > 0);
		assertNotNull(data.getRefreshToken());
		assertTrue(!data.getRefreshToken().isEmpty());
		assertNotNull(data.getTokenType());
		assertTrue(!data.getTokenType().isEmpty());

		// Confirm that NOT auto-saving the access token works
		assertTrue(client.getAuth().getAccessToken().isEmpty());
		assertTrue(client.getAuth().getAccessTokenType().isEmpty());

		// Confirm that auto-saving the access token works
		client.getOauthData(code, clientId, secret, state, true);
		assertTrue(!client.getAuth().getAccessToken().isEmpty());
		assertTrue(!client.getAuth().getAccessTokenType().isEmpty());
	}

	@Test
	public void testGetAccount() throws Exception {
		Account account = client.getAccount();
		assertNotNull(account);
		assertNotNull(account.getId());
		assertTrue(Pattern.matches("\\A.*@hellosign.com\\z", account.getEmail()));
		assertNull(account.getCallbackUrl()); // not set
		assertNull(account.getOauthData()); // not set
		assertNotNull(account.getQuotas());
		assertNotNull(account.getApiSignatureRequestsLeft());
		assertNull(account.getDocumentsLeft()); // null = unlimited
		assertNotNull(account.getTemplatesLeft());
		assertNotNull(account.getRoleCode());
	}

	@Test
	public void testIsAccountValid() throws Exception {
		assertTrue(client.isAccountValid("chris@hellosign.com"));
	}

	@Test
	public void testIsAccountInvalid() throws Exception {
		assertFalse(client.isAccountValid("zztop@hellosign.com"));
	}

	@Test
	public void testSetAccountCallback() throws Exception {
		String callbackUrl = "https://www.example.com";
		Account account = client.setCallback(callbackUrl);
		assertNotNull(account);
		assertTrue(callbackUrl.equals(account.getCallbackUrl()));
	}

	@Test(expected = HelloSignException.class)
	public void testSetAccountCallbackInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		String callbackUrl = "foo";
		client.setCallback(callbackUrl);
	}

	@Test
	public void testGetTeam() throws Exception {
		Team team = client.getTeam();
		assertNotNull(team);
	}

	@Test(expected = HelloSignException.class)
	public void testGetTeamInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.getTeam();
	}

	@Test
	public void testCreateTeam() throws Exception {
		String teamName = "Team Echevaria";
		Team newTeam = client.createTeam(teamName);
		assertNotNull(newTeam);
		assertTrue(teamName.equals(newTeam.getName()));
	}

	@Test(expected = HelloSignException.class)
	public void testCreateTeamInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		client.createTeam("foo");
	}

	@Test
	public void testInviteTeamMember() throws Exception {
		String email = "chris+2@hellosign.com";
		Team team = client.inviteTeamMember(email);
		boolean emailFound = false;
		for (Account a : team.getInvitedAccounts()) {
			if (email.equals(a.getEmail())) {
				emailFound = true;
				break;
			}
		}
		assertTrue(emailFound);
	}

	@Test(expected = HelloSignException.class)
	public void testInviteTeamMemberInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		client.inviteTeamMember("foo");
	}

	@Test
	public void testRemoveTeamMember() throws Exception {
		String email = "chris+1@hellosign.com";
		Team team = client.removeTeamMember(email);
		for (Account a : team.getAccounts()) {
			assertFalse(email.equals(a.getEmail()));
		}
	}

	@Test(expected = HelloSignException.class)
	public void testRemoveTeamMemberInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.removeTeamMember("foo");
	}

	@Test
	public void testUpdateTeamName() throws Exception {
		String name = "Team America";
		Team team = client.updateTeamName(name);
		assertNotNull(team);
		assertTrue(name.equals(team.getName()));
	}

	@Test(expected = HelloSignException.class)
	public void testUpdateTeamNameInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.updateTeamName("foo");
	}

	@Test
	public void testDestroyTeam() throws Exception {
		doReturn(200).when(spy).getLastResponseCode();
		client.destroyTeam();
	}

	@Test(expected = HelloSignException.class)
	public void testDestroyTeamInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.destroyTeam();
	}

	@Test
	public void testGetSignatureRequest() throws Exception {
		String id = "5fd97d3b6a2ac509b7837891d8c804e29cc35636";
		SignatureRequest request = client.getSignatureRequest(id);
		assertNotNull(request);
		assertTrue(id.equals(request.getId()));
	}

	@Test(expected = HelloSignException.class)
	public void testGetSignatureRequestInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.getSignatureRequest("foo");
	}

	@Test
	public void testGetSignatureRequests() throws Exception {
		SignatureRequestList list = client.getSignatureRequests();
		for (SignatureRequest s : list) {
			assertNotNull(s);
			assertNotNull(s.getId());
		}
	}

	@Test(expected = HelloSignException.class)
	public void testGetSignatureRequestsInvalid() throws Exception {
		doReturn(401).when(spy).getLastResponseCode();
		client.getSignatureRequests();
	}

	@Test
	public void testGetSignatureRequestsPage() throws Exception {
		SignatureRequestList list = client.getSignatureRequests(1);
		for (SignatureRequest s : list) {
			assertNotNull(s);
			assertNotNull(s.getId());
		}
	}

	@Test
	public void testGetSignatureRequestsPageInvalid() throws Exception {
		SignatureRequestList list = client.getSignatureRequests(19);
		assertFalse(list.iterator().hasNext());
	}

	@Test
	public void testSendSignatureRequest() throws Exception {
		String subject = "From the Mare";
		String message = "Pls sign";
		SignatureRequest req = new SignatureRequest();
		req.setTestMode(true);
		req.addSigner("charlie@hotmail.com", "Charlie Day");
		req.addFileUrl("http://www.orimi.com/pdf-test.pdf");
		req.setSubject(subject);
		req.setMessage(message);
		SignatureRequest sentReq = client.sendSignatureRequest(req);
		assertNotNull(sentReq);
		assertTrue(sentReq.hasId());
		assertNotNull(sentReq.getSignature("charlie@hotmail.com", "Charlie Day"));
		assertTrue(subject.equals(sentReq.getSubject()));
		assertTrue(message.equals(sentReq.getMessage()));
		assertTrue(req.isTestMode());
	}

	@Test(expected = HelloSignException.class)
	public void testSendSignatureRequestInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		SignatureRequest req = new SignatureRequest();
		req.setTestMode(true);
		client.sendSignatureRequest(req);
	}

	@Test
	public void testUpdateSignatureRequest() throws Exception {
		String id = "5fd97d3b6a2ac509b7837891d8c804e29cc35636";
		String signatureId = "c390fac7bb23c2b48e6314272ec9db17";
		String newEmailAddress = "barack@obama.com";
		SignatureRequest updatedReq = client.updateSignatureRequest(id, signatureId, newEmailAddress);
		assertNotNull(updatedReq);
		assertTrue(id.equals(updatedReq.getId()));
		Signature sig = updatedReq.getSignature(newEmailAddress, "Barack");
		assertNotNull(sig);
		assertTrue(signatureId.equals(sig.getId()));
	}

	@Test(expected = HelloSignException.class)
	public void testUpdateSignatureRequestInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		String id = "84f8767b525611511ed24e5eaacee537589a30be";
		String signatureId = "e477e554af09555eea762d1c204d9f3d";
		String newEmailAddress = "nightman@hotmail.com";
		client.updateSignatureRequest(id, signatureId, newEmailAddress);
	}

	@Test
	public void testGetTemplates() throws Exception {
		TemplateList templates = client.getTemplates();
		assertNotNull(templates);
		for (Template t : templates) {
			assertNotNull(t);
			assertTrue(t.hasId());
		}
	}

	@Test(expected = HelloSignException.class)
	public void testGetTemplatesInvalid() throws Exception {
		doReturn(401).when(spy).getLastResponseCode();
		client.getTemplates();
	}

	@Test
	public void testGetTemplatesPage() throws Exception {
		TemplateList templates = client.getTemplates(1);
		assertNotNull(templates);
		for (Template t : templates) {
			assertNotNull(t);
			assertTrue(t.hasId());
		}
	}

	@Test
	public void testGetTemplatesPageInvalid() throws Exception {
		TemplateList templates = client.getTemplates(10);
		assertNotNull(templates);
		assertFalse(templates.iterator().hasNext());
	}

	@Test
	public void testGetTemplateFile() throws Exception {
		// Mock a random byte size written
		doReturn((long) 100000).when(spy).getLastResponseAsFile(any(File.class));
		File f = client.getTemplateFile("templateid");
		assertNotNull(f);
		assertTrue(f.exists());
		assertTrue(f.delete());
	}

	@Test(expected = HelloSignException.class)
	public void testGetTemplateFileInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.getTemplateFile("foo");
	}

	@Test
	public void testGetTemplate() throws Exception {
		String templateId = "475c0a43282985bb0fc02c995bfce6df2840a6f5";
		Template template = client.getTemplate(templateId);
		assertNotNull(template);
		assertTrue(templateId.equals(template.getId()));
		for (TemplateRole s : template.getSignerRoles()) {
			assertNotNull(s.getRole());
		}
		for (Document d : template.getDocuments()) {
			assertNotNull(d.getName());
			for (CustomField cf : d.getCustomFields()) {
				assertNotNull(cf.getApiId());
				assertNotNull(cf.getName());
				assertNotNull(cf.getType());
				assertNotNull(cf.getX());
				assertNotNull(cf.getY());
				assertNotNull(cf.getWidth());
				assertNotNull(cf.getHeight());
				assertNotNull(cf.isRequired());
				if (cf.getType().equals(FieldType.text)) {
					assertNotNull(cf.getEstimatedTextLines());
					assertNotNull(cf.getEstimatedCharsPerLine());
				}
			}
			for (FormField ff : d.getFormFields()) {
				assertNotNull(ff.getApiId());
				assertNotNull(ff.getName());
				assertNotNull(ff.getType());
				assertNotNull(ff.getX());
				assertNotNull(ff.getY());
				assertNotNull(ff.getWidth());
				assertNotNull(ff.getHeight());
				assertNotNull(ff.isRequired());
				assertNotNull(ff.getSigner());
				if (ff.getType().equals(FieldType.text)) {
					assertNotNull(ff.getEstimatedTextLines());
					assertNotNull(ff.getEstimatedCharsPerLine());
				}
			}
			for (Account a : template.getAccounts()) {
				assertNotNull(a);
			}
		}

	}

	@Test(expected = HelloSignException.class)
	public void testGetTemplateInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.getTemplateFile("foo");
	}

	@Test
	public void testAddTemplateUser() throws Exception {
		String templateId = "475c0a43282985bb0fc02c995bfce6df2840a6f5";
		String email = "chris+1@hellosign.com";
		Template template = client.addTemplateUser(templateId, email);
		boolean found = false;
		for (Account a : template.getAccounts()) {
			if (email.equals(a.getEmail())) {
				found = true;
				break;
			}
		}
		assertTrue(found);
	}

	@Test(expected = HelloSignException.class)
	public void testAddTemplateUserInvalid() throws Exception {
		doReturn(403).when(spy).getLastResponseCode();
		client.addTemplateUser("foo", "bar");
	}

	@Test
	public void testDeleteTemplate() throws Exception {
		doReturn(200).when(spy).getLastResponseCode();
		client.deleteTemplate("foo");
	}

	@Test(expected = HelloSignException.class)
	public void testDeleteTemplateInvalid() throws Exception {
		doReturn(401).when(spy).getLastResponseCode();
		client.deleteTemplate("foo");
	}

	@Test
	public void testRemoveTemplateUser() throws Exception {
		String templateId = "475c0a43282985bb0fc02c995bfce6df2840a6f5";
		String email = "chris+1@hellosign.com";
		Template template = client.removeTemplateUser(templateId, email);
		assertNotNull(template);
		boolean found = false;
		for (Account a : template.getAccounts()) {
			if (email.equals(a.getEmail())) {
				found = true;
			}
		}
		assertFalse(found);
	}

	@Test(expected = HelloSignException.class)
	public void testRemoveTemplateUserInvalid() throws Exception {
		doReturn(403).when(spy).getLastResponseCode();
		String templateId = "475c0a43282985bb0fc02c995bfce6df2840a6f5";
		String email = "chris@hellosign.com";
		client.removeTemplateUser(templateId, email);
	}

	@Test
	public void testSendTemplateSignatureRequest() throws Exception {
		String templateId = "9cc3d5819959419abee4dbff2073d497e7c0a962";
		String title = "Java SDK request";
		String message = "Pls to be signing kthx";
		TemplateSignatureRequest req = new TemplateSignatureRequest();
		req.setTemplateId(templateId);
		req.setTitle(title);
		req.setMessage(message);
		req.setSigner("Tester A", "chris+a@hellosign.com", "Chris A");
		req.setSigner("Tester B", "chris+b@hellosign.com", "Chris B");
		Map<String, String> fields = new HashMap<String, String>();
		fields.put("Field A", "Hello");
		fields.put("Field B", "World!");
		fields.put("Checkbox A", "true");
		fields.put("Checkbox B", "false");
		req.setCustomFields(fields);
		SignatureRequest sentReq = client.sendTemplateSignatureRequest(req);
		assertNotNull(sentReq);
		assertTrue(title.equals(sentReq.getTitle()));
		assertTrue(message.equals(sentReq.getMessage()));
		for (CustomField cf : sentReq.getCustomFields()) {
			assertTrue(fields.get(cf.getName()).equals(cf.getValue()));
		}
	}

	@Test(expected = HelloSignException.class)
	public void testSendTemplateSignatureRequestInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		SignatureRequest req = new SignatureRequest();
		req.addFileUrl("http://www.example.com");
		client.sendSignatureRequest(req);
	}

	@Test
	public void testCancelSignatureRequest() throws Exception {
		doReturn(200).when(spy).getLastResponseCode();
		assertTrue(client.cancelSignatureRequest("9cc3d5819959419abee4dbff2073d497e7c0a962"));
	}

	@Test(expected = HelloSignException.class)
	public void testCancelSignatureRequestInvalid() throws Exception {
		doReturn(410).when(spy).getLastResponseCode();
		client.cancelSignatureRequest("foo");
	}

	@Test
	public void testRequestEmailReminder() throws Exception {
		String id = "89d1f4f831ff1bbaf707c398881d98bff447c64e";
		SignatureRequest req = client.requestEmailReminder(id, "chris+a@hellosign.com");
		assertNotNull(req);
		assertTrue(id.equals(req.getId()));
	}

	@Test(expected = HelloSignException.class)
	public void testRequestEmailReminderInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		String id = "89d1f4f831ff1bbaf707c398881d98bff447c64e";
		client.requestEmailReminder(id, "chris+a@hellosign.comd");
	}

	@Test
	public void testGetFiles() throws Exception {
		// Mock a random byte size written
		doReturn((long) 100000).when(spy).getLastResponseAsFile(any(File.class));
		File f = client.getFiles("id");
		// This really just makes sure a temp file is created
		// the content isn't actually written, since we'd have to
		// mock the response stream
		assertNotNull(f);
		assertTrue(f.exists());
		assertTrue(f.delete());
	}

	@Test(expected = HelloSignException.class)
	public void testGetFilesInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.getFiles("foo");
	}

	@Test
	public void testCreateApiApp() throws Exception {
		ApiApp app = new ApiApp();
		app.setName("Java API App");
		app.setDomain("example.com");
		app.setCallbackUrl("http://www.example.com");
		ApiApp createdApp = client.createApiApp(app);
		assertNotNull(createdApp);
		assertNotNull(createdApp.getClientId());
		assertTrue(app.getName().equals(createdApp.getName()));
		assertTrue(app.getDomain().equals(createdApp.getDomain()));
		assertTrue(app.getCallbackUrl().equals(createdApp.getCallbackUrl()));
	}

	@Test(expected = HelloSignException.class)
	public void testCreateApiAppInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		ApiApp app = new ApiApp();
		app.setName("Java API App");
		client.createApiApp(app);
	}

	@Test
	public void testGetApiApp() throws Exception {
		ApiApp app = client.getApiApp("034fb51064187cf28e4aad1c2533ad8f");
		assertNotNull(app);
	}

	@Test(expected = HelloSignException.class)
	public void testGetApiAppInvalid() throws Exception {
		doReturn(401).when(spy).getLastResponseCode();
		client.getApiApp("034fb51064187cf28e4aad1c2533ad8f");
	}

	@Test
	public void testGetApiApps() throws Exception {
		ApiAppList appList = client.getApiApps();
		assertNotNull(appList);
		assertNotNull(appList.getNumPages());
		assertTrue(appList.getNumPages() > 0);
		assertNotNull(appList.getNumResults());
		assertTrue(appList.getNumResults() > 0);
		assertNotNull(appList.getPageSize());
		assertTrue(appList.getPageSize() > 0);
		for (ApiApp app : appList) {
			assertNotNull(app);
			assertNotNull(app.getClientId());
		}
	}

	@Test(expected = HelloSignException.class)
	public void testGetApiAppsInvalid() throws Exception {
		doReturn(401).when(spy).getLastResponseCode();
		client.getApiApps();
	}

	@Test
	public void testCreateEmbeddedRequest() throws Exception {
		SignatureRequest req = new SignatureRequest();
		req.addFileUrl("http://www.orimi.com/pdf-test.pdf");
		req.addSigner("chris@hellosign.com", "Chris");
		req.setTestMode(true);
		req.addMetadata("test_key", "test_value");
		EmbeddedRequest embeddedReq = new EmbeddedRequest("034fb51064187cf28e4aad1c2533ad8f", req);
		AbstractRequest newReq = client.createEmbeddedRequest(embeddedReq);
		assertNotNull(newReq);
		assertNotNull(newReq.getId());
		assertTrue(req.getMetadata("test_key").equals(newReq.getMetadata("test_key")));
	}

	@Test(expected = HelloSignException.class)
	public void testCreateEmbeddedRequestInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		EmbeddedRequest embeddedReq = new EmbeddedRequest("clientId", new SignatureRequest());
		client.createEmbeddedRequest(embeddedReq);
	}

	@Test
	public void testGetEmbeddedSignUrl() throws Exception {
		EmbeddedResponse s = client.getEmbeddedSignUrl("37b35bb8b53e3ed26658c1b64c2ffa08");
		assertNotNull(s);
		assertNotNull(s.getSignUrl());
		assertNotNull(s.getExpiresAt());
	}

	@Test(expected = HelloSignException.class)
	public void testGetEmbeddedSignUrlInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		client.getEmbeddedSignUrl("foo");
	}

	@Test
	public void testCreateUnclaimedDraft() throws Exception {
		UnclaimedDraft draft = new UnclaimedDraft();
		draft.addFileUrl("http://www.orimi.com/pdf-test.pdf");
		draft.setType(UnclaimedDraftType.request_signature);
		draft.setSubject("Java is hot hot hot");
		draft.setMessage("Best served at 180 degrees");
		UnclaimedDraft response = client.createUnclaimedDraft(draft);
		assertNotNull(response);
		assertNotNull(response.getClaimUrl());
		assertFalse(response.isTestMode());
		assertNotNull(response.getExpiresAt());
		assertNotNull(response.getSignatureRequestId());
	}

	@Test(expected = HelloSignException.class)
	public void testCreateUnclaimedDraftInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		client.createUnclaimedDraft(new UnclaimedDraft());
	}

	@Test
	public void testCreateEmbeddedTemplateDraft() throws Exception {
		TemplateDraft draft = new TemplateDraft();
		draft.setClientId("034fb51064187cf28e4aad1c2533ad8f");
		draft.addFileUrl("http://www.orimi.com/pdf-test.pdf");
		draft.addSignerRole("Role A", 1);
		draft.addSignerRole("Role B", 2);
		draft.addCCRole("Lawyer");
		draft.addCCRole("Manager");
		draft.addMergeField("Full Name", FieldType.text);
		draft.addMergeField("Is registered?", FieldType.checkbox);
		draft.addMetadata("test_key", "test_value");
		EmbeddedRequest embeddedReq = new EmbeddedRequest("034fb51064187cf28e4aad1c2533ad8f", draft);
		TemplateDraft response = client.createEmbeddedTemplateDraft(embeddedReq);
		assertNotNull(response);
		assertNotNull(response.getId());
		assertNotNull(response.getEditUrl());
		assertNotNull(response.getExpiresAt());
	}

	@Test(expected = HelloSignException.class)
	public void testCreateEmbeddedTemplateDraftInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		client.createEmbeddedTemplateDraft(new EmbeddedRequest("foo", new TemplateDraft()));
	}

	@Test
	public void testGetEmbeddedTemplateEditUrl() throws Exception {
		EmbeddedResponse response = client.getEmbeddedTemplateEditUrl("foo");
		assertNotNull(response);
		assertNotNull(response.getEditUrl());
		assertNotNull(response.getExpiresAt());
	}

	@Test(expected = HelloSignException.class)
	public void testGetEmbeddedTemplateEditUrlInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		client.getEmbeddedTemplateEditUrl("foo");
	}

	@Test
	public void testUpdateApiApp() throws Exception {
		// Usually, you'd retrieve this from the client first, update, and then send
		JSONObject obj = new JSONObject(getTestFileAsString("testGetApiApp.json"));
		ApiApp app = new ApiApp(obj);
		WhiteLabelingOptions options = new WhiteLabelingOptions();
		options.setPrimaryButtonColor("#FF0000");
		app.setWhiteLabelingOptions(options);
		ApiApp updatedApp = client.updateApiApp(app);
		assertNotNull(updatedApp);
		assertTrue(app.getWhiteLabelingOptions().getPrimaryButtonColor().equalsIgnoreCase(updatedApp.getWhiteLabelingOptions().getPrimaryButtonColor()));
	}

	@Test(expected = HelloSignException.class)
	public void testUpdateApiAppInvalid() throws Exception {
		doReturn(400).when(spy).getLastResponseCode();
		client.updateApiApp(new ApiApp());
	}

	@Test
	public void testDeleteApiApp() throws Exception {
		doReturn(204).when(spy).getLastResponseCode();
		assertTrue(client.deleteApiApp("034fb51064187cf28e4aad1c2533ad8f"));
	}

	@Test(expected = HelloSignException.class)
	public void testDeleteApiAppInvalid() throws Exception {
		doReturn(404).when(spy).getLastResponseCode();
		assertFalse(client.deleteApiApp("foo"));
	}
}