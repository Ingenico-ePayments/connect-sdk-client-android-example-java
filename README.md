# Ingenico Connect Android SDK example

**This example app has been rebranded to Worldline. As part of the rebranding the example app has moved to https://github.com/Worldline-Global-Collect/connect-sdk-client-android-example-java.**

---

This example app illustrates the use of the [Ingenico Connect Android Client SDK](https://github.com/Ingenico-ePayments/connect-sdk-client-android) and the services provided by Ingenico ePayments on the Ingenico ePayments platform.
This repository contains a Java XML based example. It demonstrates the UI and business logic required to perform a basic Credit Card payment. The steps supported are selecting a payment product, fill in the required payment details and encrypting those details.

See the [Ingenico Connect Developer Hub](https://epayments.developer-ingenico.com/documentation/sdk/mobile/android/) for more information on how to use the SDK.

## Installation

To run this example app for the Ingenico Connect Android Client SDK, first clone the code from GitHub:

```
$ git clone https://github.com/Ingenico-ePayments/connect-sdk-client-android-example-java.git
```

Afterwards, open and run the Android Studio project.

### How do I configure a session?

When you start the example you will see a form as the first screen where session details and payment details can be entered.
You can also select additional options under other options.

#### Session details

In order to use the SDK you need a session. This session can be created by making a Client Session request via in the Server to Server API.
It is also possible to use the API Explorer to obtain client session details. The JSON response with the Session id, Customer id, API URL and assets URL can be pasted in the appropriate fields.

#### Payment details

Set the payment details to any values you like to test a payment. Note that CountryCode, CurrencyCode and amount, as well as your configuration all influence which products will be available for the current payment.
