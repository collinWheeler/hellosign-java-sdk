# AccountApi

All URIs are relative to *https://api.hellosign.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCreate**](AccountApi.md#accountCreate) | **POST** /account/create | Create Account
[**accountGet**](AccountApi.md#accountGet) | **GET** /account | Get Account
[**accountUpdate**](AccountApi.md#accountUpdate) | **PUT** /account | Update Account
[**accountVerify**](AccountApi.md#accountVerify) | **POST** /account/verify | Verify Account



## accountCreate

> AccountCreateResponse accountCreate(accountCreateRequest)

Create Account

Creates a new HelloSign Account that is associated with the specified `email_address`.

### Example

```java
import org.hellosign.openapi.ApiClient;
import org.hellosign.openapi.ApiException;
import org.hellosign.openapi.Configuration;
import org.hellosign.openapi.api.*;
import org.hellosign.openapi.auth.HttpBasicAuth;
import org.hellosign.openapi.auth.HttpBearerAuth;
import org.hellosign.openapi.model.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: api_key
        HttpBasicAuth api_key = (HttpBasicAuth) defaultClient
            .getAuthentication("api_key");
        api_key.setUsername("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
/*      HttpBearerAuth oauth2 = (HttpBearerAuth) defaultClient
            .getAuthentication("oauth2");

        oauth2.setBearerToken("YOUR_ACCESS_TOKEN");*/

        AccountApi api = new AccountApi(defaultClient);

        AccountCreateRequest data = new AccountCreateRequest()
            .emailAddress("newuser@hellosign.com");

        try {
            AccountCreateResponse result = api.accountCreate(data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountCreateRequest** | [**AccountCreateRequest**](AccountCreateRequest.md)|  |

### Return type

[**AccountCreateResponse**](AccountCreateResponse.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | failed operation |  -  |


## accountGet

> AccountGetResponse accountGet()

Get Account

Returns the properties and settings of your Account.

### Example

```java
import org.hellosign.openapi.ApiClient;
import org.hellosign.openapi.ApiException;
import org.hellosign.openapi.Configuration;
import org.hellosign.openapi.api.*;
import org.hellosign.openapi.auth.HttpBasicAuth;
import org.hellosign.openapi.auth.HttpBearerAuth;
import org.hellosign.openapi.model.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: api_key
        HttpBasicAuth api_key = (HttpBasicAuth) defaultClient
            .getAuthentication("api_key");
        api_key.setUsername("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
/*      HttpBearerAuth oauth2 = (HttpBearerAuth) defaultClient
            .getAuthentication("oauth2");

        oauth2.setBearerToken("YOUR_ACCESS_TOKEN");*/

        AccountApi api = new AccountApi(defaultClient);

        try {
            AccountGetResponse result = api.accountGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AccountGetResponse**](AccountGetResponse.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | failed operation |  -  |


## accountUpdate

> AccountGetResponse accountUpdate(accountUpdateRequest)

Update Account

Updates the properties and settings of your Account.

### Example

```java
import org.hellosign.openapi.ApiClient;
import org.hellosign.openapi.ApiException;
import org.hellosign.openapi.Configuration;
import org.hellosign.openapi.api.*;
import org.hellosign.openapi.auth.HttpBasicAuth;
import org.hellosign.openapi.auth.HttpBearerAuth;
import org.hellosign.openapi.model.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: api_key
        HttpBasicAuth api_key = (HttpBasicAuth) defaultClient
            .getAuthentication("api_key");
        api_key.setUsername("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
/*      HttpBearerAuth oauth2 = (HttpBearerAuth) defaultClient
            .getAuthentication("oauth2");

        oauth2.setBearerToken("YOUR_ACCESS_TOKEN");*/

        AccountApi api = new AccountApi(defaultClient);

        AccountUpdateRequest data = new AccountUpdateRequest()
            .callbackUrl("https://www.example.com/callback");

        try {
            AccountGetResponse result = api.accountUpdate(data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUpdateRequest** | [**AccountUpdateRequest**](AccountUpdateRequest.md)|  |

### Return type

[**AccountGetResponse**](AccountGetResponse.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | failed operation |  -  |


## accountVerify

> AccountVerifyResponse accountVerify(accountVerifyRequest)

Verify Account

Verifies whether an HelloSign Account exists for the given email address.

**NOTE** This method is restricted to paid API users.

### Example

```java
import org.hellosign.openapi.ApiClient;
import org.hellosign.openapi.ApiException;
import org.hellosign.openapi.Configuration;
import org.hellosign.openapi.api.*;
import org.hellosign.openapi.auth.HttpBasicAuth;
import org.hellosign.openapi.auth.HttpBearerAuth;
import org.hellosign.openapi.model.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: api_key
        HttpBasicAuth api_key = (HttpBasicAuth) defaultClient
            .getAuthentication("api_key");
        api_key.setUsername("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
/*      HttpBearerAuth oauth2 = (HttpBearerAuth) defaultClient
            .getAuthentication("oauth2");

        oauth2.setBearerToken("YOUR_ACCESS_TOKEN");*/

        AccountApi api = new AccountApi(defaultClient);

        AccountVerifyRequest data = new AccountVerifyRequest()
            .emailAddress("some_user@hellosign.com");

        try {
            AccountVerifyResponse result = api.accountVerify(data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountVerifyRequest** | [**AccountVerifyRequest**](AccountVerifyRequest.md)|  |

### Return type

[**AccountVerifyResponse**](AccountVerifyResponse.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | failed operation |  -  |
