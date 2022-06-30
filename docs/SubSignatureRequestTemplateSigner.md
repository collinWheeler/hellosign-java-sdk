

# SubSignatureRequestTemplateSigner



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
| `role`<sup>*_required_</sup> | ```String``` |  Must match an existing role in chosen Template(s). It&#39;s case-sensitive.  |  |
| `name`<sup>*_required_</sup> | ```String``` |  The name of the signer.  |  |
| `emailAddress`<sup>*_required_</sup> | ```String``` |  The email address of the signer.  |  |
| `pin` | ```String``` |  The 4- to 12-character access code that will secure this signer&#39;s signature page.  |  |
| `smsPhoneNumber` | ```String``` |  An E.164 formatted phone number.<br><br>**Note**: Not available in test mode and requires a Standard plan or higher.  |  |
| `smsPhoneNumberType` | [```SmsPhoneNumberTypeEnum```](#SmsPhoneNumberTypeEnum) |  **Note**: This only works in non embedded endpoints.<br><br>If set, the value must be either `authentication` or `delivery`. Default `authentication`. <br><br>If `authentication` is set, `sms_phone_number` will receive a code via SMS to access this signer&#39;s signature page.<br><br>If `delivery` is set, signature request will be delivered to both email and `sms_phone_number`.  |  |



## Enum: SmsPhoneNumberTypeEnum

Name | Value
---- | -----
| AUTHENTICATION | &quot;authentication&quot; |
| DELIVERY | &quot;delivery&quot; |


