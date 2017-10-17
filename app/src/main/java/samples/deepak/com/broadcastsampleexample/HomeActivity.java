package samples.deepak.com.broadcastsampleexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.GridView;

/**
 * Created by deepak on 10/17/2017.
 */

public class HomeActivity extends Activity {

    GridView gridViewMenu;

    @Override
    public void onCreate(Bundle savedInstance) {


        super.onCreate(savedInstance);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home_activity);

        initializeComponent();
        setGridViewAdapter();


    }


    private void initializeComponent() {

        gridViewMenu = (GridView) findViewById(R.id.grid_view_menu);
    }


    private void setGridViewAdapter() {


        gridViewMenu.setAdapter(new ImageAdapter(this,gridViewMenu));
        gridViewMenu.setNumColumns(2);
        gridViewMenu.setHorizontalSpacing(2);
        gridViewMenu.setVerticalSpacing(2);


        ;
    }
}
