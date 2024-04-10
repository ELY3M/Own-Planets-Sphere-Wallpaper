package own.ownplanetsspherelivewallpaper;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Website extends Activity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.webview);
        WebView webview = (WebView) findViewById(R.id.webview);
        webview.setVerticalScrollBarEnabled(false);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://github.com/ELY3M/Own-Planets-Sphere-Wallpaper");
    }
}
