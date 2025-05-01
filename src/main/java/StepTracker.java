import java.util.ArrayList;
public class StepTracker
{
  private int minSteps, actDays, totalSteps, totDays;
 
 public StepTracker(int steps){
  totalSteps+=steps;
  totDays++;
  if(steps>= minSteps) actDays++;
 }
 public int activeDays(){
 return actDays;
 }
 
 public int averageSteps(){
   if (totDays ==0) return 0;
 return (int)((double) totalSteps/ (double)totDays);
 }
} 
