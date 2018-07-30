package agency.tango.materialintroscreen.animations.wrappers;

import android.view.View;

import agency.tango.materialintroscreen.animations.ViewTranslationWrapper;
import agency.tango.materialintroscreen.animations.translations.DefaultPositionTranslation;
import agency.tango.materialintroscreen.animations.translations.EnterDefaultTranslation;
import agency.tango.materialintroscreen.animations.translations.ExitDefaultTranslation;

public class SkipButtonTranslationWrapper extends ViewTranslationWrapper {
    public SkipButtonTranslationWrapper(View view) {
        super(view);

        setDefaultTranslation(new DefaultPositionTranslation())
                .setSkipExitTranslation(new ExitDefaultTranslation());
                //.setExitTranslation(new ExitDefaultTranslation());
    }
}