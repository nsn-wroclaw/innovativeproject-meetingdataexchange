package asynctasks;

import org.json.JSONObject;

import serverCommunicator.CommunicationHelper;
import serverCommunicator.LogInHelper;

import com.TrololoCompany.meetingdataexchange.LogInActivity;

import android.os.AsyncTask;

public class HttpPostRequestLogIn extends AsyncTask<String, Void, Void>
{
	
	private LogInActivity activty;
	private String address;
	private String name;
	private String login;
	private String password;
	private String result[];

	@Override
	protected Void doInBackground(String... arg0) 
	{
		//arg0[0] -address
		//arg0[1] -name
		//arg0[2] -login
		//arg0[3] -password
		
		address=arg0[0];
		name=arg0[1];
		login=arg0[2];
		password=arg0[3];
		CommunicationHelper communication= new CommunicationHelper();
		LogInHelper logHelper= new LogInHelper();
		JSONObject json=logHelper.makeJSON2LogIn(login, password);
		String respond=communication.getPostHttpRequest("http://"+address+"/api/account/login", json);
		result=logHelper.parseJSONRespondLogIn(respond);
		return null;
		
	}
	

}
