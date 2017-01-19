
package pack_generic;

import com.pynting.androidframe_c.Controller;
import com.pynting.androidframe_c.R;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
public class Act_MainGUI extends Activity {

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	try {
	    mViewPager = new ViewPager(this);
	    mViewPager.setId(R.id.pager);
	    setContentView(mViewPager);
	    final ActionBar bar = getActionBar();
	    bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	    bar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
	    try {
		Controller class_Controller = Controller.getInstance();
	    } catch (Exception e) {
		Log.i("-----Act_MainGUI", "class_Controller failed: " + e.getMessage());
		e.printStackTrace();
	    }
	    Bundle bundle = new Bundle();
	    getWindow().getDecorView().setBackgroundColor(Color.rgb(0, 0, 100));
	} catch (Throwable E) {
	    E.printStackTrace();
	}
    }
}
