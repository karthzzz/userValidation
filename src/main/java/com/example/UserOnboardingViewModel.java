package com.example;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.annotation.Init;

public class UserOnboardingViewModel {

    private String email;
    private String matchedUser = "Sanefar, Amir DE/MBR FROM CSL Behring DE";
    private boolean userSelected;
    private boolean platformSelected;
    private boolean positCloudSelected;
    private boolean redshiftSelected;
    private boolean step1Visible;
    private boolean step2Visible;
    private boolean step3Visible;
    private boolean step4Visible;

    @Init
    public void init() {
        email = "";
        userSelected = false;
        platformSelected = false;
        positCloudSelected = false;
        redshiftSelected = false;
        step1Visible = true;
        step2Visible = false;
        step3Visible = false;
        step4Visible = false;
    }

    @Command
    @NotifyChange({"step1Visible", "step2Visible", "step3Visible", "step4Visible"})
    public void nextStep1() {
        step1Visible = false;
        step2Visible = true;
    }

    @Command
    @NotifyChange({"step1Visible", "step2Visible", "step3Visible", "step4Visible"})
    public void nextStep2() {
        step2Visible = false;
        step3Visible = true;
    }

    @Command
    @NotifyChange({"step1Visible", "step2Visible", "step3Visible", "step4Visible"})
    public void nextStep3() {
        step3Visible = false;
        step4Visible = true;
    }

    @Command
    @NotifyChange({"step1Visible", "step2Visible", "step3Visible", "step4Visible", "email"})
    public void cancel() {
        init();
    }

    @Command
    public void done() {
        // Finalize the onboarding process
        org.zkoss.zk.ui.util.Clients.showNotification("User has been onboarded successfully!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatchedUser() {
        return matchedUser;
    }

    public void setMatchedUser(String matchedUser) {
        this.matchedUser = matchedUser;
    }

    public boolean isUserSelected() {
        return userSelected;
    }

    public void setUserSelected(boolean userSelected) {
        this.userSelected = userSelected;
    }

    public boolean isPlatformSelected() {
        return platformSelected;
    }

    public void setPlatformSelected(boolean platformSelected) {
        this.platformSelected = platformSelected;
    }

    public boolean isPositCloudSelected() {
        return positCloudSelected;
    }

    public void setPositCloudSelected(boolean positCloudSelected) {
        this.positCloudSelected = positCloudSelected;
    }

    public boolean isRedshiftSelected() {
        return redshiftSelected;
    }

    public void setRedshiftSelected(boolean redshiftSelected) {
        this.redshiftSelected = redshiftSelected;
    }

    public boolean isStep1Visible() {
        return step1Visible;
    }

    public boolean isStep2Visible() {
        return step2Visible;
    }

    public boolean isStep3Visible() {
        return step3Visible;
    }

    public boolean isStep4Visible() {
        return step4Visible;
    }
}