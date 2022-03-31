

# SubFormFieldsPerDocumentText

This class extends `SubFormFieldsPerDocumentBase`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
| `type`<sup>*_required_</sup> | ```String``` |  A text input field. Use the `SubFormFieldsPerDocumentText` class.  |  |
| `placeholder` | ```String``` |  Placeholder value for text field.  |  |
| `autoFillType` | ```String``` |  Auto fill type for populating fields automatically. Check out the list of [auto fill types](https://app.hellosign.com/api/reference#AutoFillTypes) to learn more about the possible values.  |  |
| `masked` | ```Boolean``` |  Masks entered data. For more information see [Masking sensitive information](https://app.hellosign.com/api/reference#:~:text&#x3D;Masking%20sensitive%20information). `true` for masking the data in a text field, otherwise `false`.  |  |
| `validationType` | [```ValidationTypeEnum```](#ValidationTypeEnum) |  Each text field may contain a `validation_type` parameter. Check out the list of [validation types](https://faq.hellosign.com/hc/en-us/articles/217115577) to learn more about the possible values.<br><br>**NOTE**: When using `custom_regex` you are required to pass a second parameter `validation_custom_regex` and you can optionally provide `validation_custom_regex_format_label` for the error message the user will see in case of an invalid value.  |  |
| `validationCustomRegex` | ```String``` |    |  |
| `validationCustomRegexFormatLabel` | ```String``` |    |  |



## Enum: ValidationTypeEnum

Name | Value
---- | -----
| NUMBERS_ONLY | &quot;numbers_only&quot; |
| LETTERS_ONLY | &quot;letters_only&quot; |
| PHONE_NUMBER | &quot;phone_number&quot; |
| BANK_ROUTING_NUMBER | &quot;bank_routing_number&quot; |
| BANK_ACCOUNT_NUMBER | &quot;bank_account_number&quot; |
| EMAIL_ADDRESS | &quot;email_address&quot; |
| ZIP_CODE | &quot;zip_code&quot; |
| SOCIAL_SECURITY_NUMBER | &quot;social_security_number&quot; |
| EMPLOYER_IDENTIFICATION_NUMBER | &quot;employer_identification_number&quot; |
| CUSTOM_REGEX | &quot;custom_regex&quot; |


