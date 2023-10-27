# MAD_practical_8_21012011040

AIM:What is BroadcastReceiver? Difference between Service and BroadcastReceiver. Create an Alarm application by using service & BroadcastReceiver by following below instructions.

Create MainActivity according to below UI design.

Create AlarmBroadcastReceiver class

Create AlarmService Class

Add android.permission.SCHEDULE_EXACT_ALARM Permission in Manifest file

**ANS:**
->Broadcast Receivers allow us to register for the system and application events, and when that event happens, then the register receivers get notified.

Different:
-> Service can continue running in the background, whereas a Broadcast Receiver should finish quickly (e.g. if it is running for more than 5 seconds it may be 
   killed by the OS). The Broadcast Receiver can still run in the background (when app is closed) under certain circumstances.

Output:
![image](https://github.com/kotadiyaharshal/MAD_practical_8_21012011040/assets/139727882/8a4d29c5-5b7f-4692-96d4-af1686ea4bcf)
![image](https://github.com/kotadiyaharshal/MAD_practical_8_21012011040/assets/139727882/abeec64c-9164-4a02-bcfe-d335ba673bc7)

