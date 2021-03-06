package alex.com.darkskyapp.components.app.dagger;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import alex.com.darkskyapp.config.Constants;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Alex on 11/11/2017.
 */

@Module
public class DataModule {

    @Inject
    public DataModule() {
    }

    @Provides
    SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences(Constants.SHARED_PREFERENCES, Context.MODE_PRIVATE);
    }
}

