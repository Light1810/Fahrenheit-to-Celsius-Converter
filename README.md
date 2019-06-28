

![Screenshot_1561712911](https://user-images.githubusercontent.com/49367575/60333337-5b843780-99b6-11e9-9950-9b2ad97eea25.png)



![Screenshot_1561712937](https://user-images.githubusercontent.com/49367575/60333338-5c1cce00-99b6-11e9-96f4-38c2630e9116.png)


Problems / Errors faced while making the applications

1> Remove or hide autofillHint warning for api < 26
	
		tools:ignore="autofill"   (might give typo warning in xml file)
    

NOTE:- xmlns:tools="http://schemas.android.com/tools"   (need to be added if not added automatically)





2> Auto hide keyboard on clicking Submit or Reset Button(s)
		
		etInput.onEditorAction(EditorInfo.IME_ACTION_DONE);


3>Prevent app from crashing when no input is given
	
		Done in this application using 

		Toast.makeText(MainActivity.this, "Please Enter Temperature in degree F", Toast.LENGTH_LONG).show();

4>Application is unuseable when the screen is rotated 

5>The position of image varies from phone to phone
