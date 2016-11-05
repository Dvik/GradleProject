package udacity.dvik.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_ID = "jokeId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_display_layout);

        TextView tv = (TextView) findViewById(R.id.joke);

        String joke = getIntent().getExtras().getString(JOKE_ID);

        if(joke!=null && joke.length()>0)
        tv.setText(joke);

    }
}
