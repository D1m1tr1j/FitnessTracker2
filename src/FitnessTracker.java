

public class FitnessTracker {

    private String name;
    private int currrentTime;
    private  int heartbeat;
    private int activityLevel;
    private int activityTrend;
    private int energyLevel;
   private String info;


public FitnessTracker(){

}

    public String getInfo(){
        System.out.println(" Tracker " + name.trim() + ":"
                + " It is : " + getCurrrentTime() + " h "
                + " current heartbeat is " + getHeartbeat()
                + " activity level is " +  getActivityLevel() + " % "
                + " current energy level is " + getEnergyLevel() + " Watt ");
        return info;
    }



    public String getName() {
        return name;
    }

        public void setName(String aName){
            if (aName != "") {
                name = aName;
            }

        }

    public int getCurrrentTime() {
        return currrentTime;
    }

        public void setCurrrentTime(int currrentTime) {

        currrentTime = (int)(System.currentTimeMillis() / (1000* 60*60) %24);

            this.currrentTime = currrentTime;
        }

    public int getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(int heartbeat) {
        if ((heartbeat < 0) || (heartbeat > 250)) {
            System.out.println("value is out of range");
        }

        else if (isNightTime(true,currrentTime)) {
        heartbeat = 45;
        heartbeat += (int) (20 * Math.random() - 11);
    }
    else {
        heartbeat = (int) (50 + activityLevel * 1.52);
    }
        this.heartbeat = heartbeat;
    }

     {
    }

    public int getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(int activityLevel) {
        if ((activityLevel < 0) || (activityLevel > 100)) {
            System.out.println("value is out of range");
        }

        else if (activityLevel < activityTrend){
            activityLevel += 5;
        }

        else if (activityLevel > activityTrend){
            activityLevel -= 4;
        }

        else if (activityLevel == activityTrend){
            setActivityTrend(activityLevel);
        }

        this.activityLevel = activityLevel;
    }

    public int getActivityTrend() {
        return activityTrend;
    }
    public void setActivityTrend(int activityTrend) {
        if ((activityTrend < 0) || (activityTrend > 100)) {
            System.out.println("value is out of range");
        }
        else {
            activityTrend += (int) (20 * Math.random() - 10);

            this.activityTrend = activityTrend;
        }
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel) {
        if ((energyLevel < 0) || (energyLevel > 1000)) {
            System.out.println("value is out of range");
        }
        else {

            energyLevel = (int) (heartbeat * activityLevel / 32.1);


            energyLevel = energyLevel;
        }
    }

    public boolean isNightTime(boolean night,int time ){

        if ((time > 0 && time < 6) || time > 22 && time < 24){
            System.out.println(" Note : Currently Night Time !");
            return night;

        }
        else return false;
    }

    public void goOn(){
    setActivityLevel(activityLevel);
    setHeartbeat(heartbeat);
    setEnergyLevel(energyLevel);
    }





}


