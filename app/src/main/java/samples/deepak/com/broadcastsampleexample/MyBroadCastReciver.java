package samples.deepak.com.broadcastsampleexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by deepak on 10/13/2017.
 */

public class MyBroadCastReciver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {


            Toast.makeText(context,"BroadCast Message Received",Toast.LENGTH_LONG).show();


    }
}
