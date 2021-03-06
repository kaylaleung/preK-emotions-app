package org.cmucreatelab.android.flutterprek.activities.student_section.coping_skills.coping_skill_static;

import org.cmucreatelab.android.flutterprek.R;

public class JumpingJacksCopingSkillActivity extends StaticCopingSkillActivity {


    @Override
    public String getAudioFileForCopingSkillTitle() {
        return "etc/audio_prompts/audio_jumping_jacks.wav";
    }


    @Override
    public int getResourceForBackground() {
        return R.drawable.background_jumping_jacks;
    }


    @Override
    public int getTextTitleResource() {
        return R.string.coping_skill_jumping_jacks;
    }

}
