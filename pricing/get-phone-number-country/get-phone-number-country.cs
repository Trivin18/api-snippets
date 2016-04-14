// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;
using Twilio.Pricing;

class Example
{
  static void Main(string[] args)
  {
    // Find your Account Sid and Auth Token at twilio.com/user/account
    const string accountSid = "AC3094732a3c49700934481addd5ce1659";
    const string authToken = "{{ auth_token }}";
    var pricingClient = new PricingClient(accountSid, authToken);

    // Look up pricing information for the UK
    var country = pricingClient.GetPhoneNumberCountry("GB");
    // Print number pricing for this country
    foreach (PhoneNumberPrice p in country.PhoneNumberPrices)
    {
        Console.WriteLine(p.NumberType);
        Console.WriteLine(p.CurrentPrice);
    } 
  }
}
