# Get the Python helper library from https://twilio.com/docs/libraries/python
from twilio.rest import Client

# Get your Account SID and Auth Token from https://twilio.com/console
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'
client = Client(account_sid, auth_token)

deployment_sid = 'FLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
deployment = client.preview\
                   .deployed_devices\
                   .deployments(sid=deployment_sid)\
                   .fetch()

print(deployment.friendly_name)
