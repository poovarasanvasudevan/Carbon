package tk.zielony.carbonsamples;

import tk.zielony.carbonsamples.SamplesActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import tk.zielony.carbonsamples.component.AvatarTextListItemActivity;
import tk.zielony.carbonsamples.component.IconTextListItemActivity;
import tk.zielony.carbonsamples.component.ImageTextSubtextDateListItemActivity;
import tk.zielony.carbonsamples.component.RegisterActivity;


public class ComponentsActivity extends SamplesActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        Samples.initToolbar(this, getString(R.string.animationsActivity_title));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        ViewModel[] items = new ViewModel[]{
                new ViewModel(IconTextListItemActivity.class, getString(R.string.iconTextListItemActivity_title)),
                new ViewModel(AvatarTextListItemActivity.class, getString(R.string.avatarTextListItemActivity_title)),
                new ViewModel(ImageTextSubtextDateListItemActivity.class, getString(R.string.imageTextSubtextDateListItemActivity_title)),
                new ViewModel(RegisterActivity.class, getString(R.string.registerActivity_title))
        };
        recyclerView.setLayoutManager(getResources().getBoolean(R.bool.tablet) ?
                new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false) :
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MainListAdapter(items));
    }

}
