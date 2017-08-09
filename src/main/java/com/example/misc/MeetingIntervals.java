package com.example.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sanjana on 5/8/17.
 * Given a set of time intervals in any order,
 * merge all overlapping intervals into one and output
 * the result which should have only mutually exclusive intervals. Let the intervals be represented as pairs of integers for simplicity.


 */
public class MeetingIntervals implements Comparable<MeetingIntervals>{
    private int startTime;
    private int endTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    MeetingIntervals(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    MeetingIntervals(){

    }
    public int compareTo(MeetingIntervals m1){
        return this.startTime - m1.startTime;
    }

    public static List<MeetingIntervals> merge(List<MeetingIntervals> sorted){
        List<MeetingIntervals> merged = new ArrayList<MeetingIntervals>();
        merged.add(sorted.get(0));
        for(int i=1; i<sorted.size();i++){
          int  size = merged.size();
            if(sorted.get(i).startTime > merged.get(size-1).endTime){
                merged.add(sorted.get(i));
            }else if(merged.get(size-1).endTime < sorted.get(i).endTime){
                merged.get(size-1).endTime = sorted.get(i).endTime;
            }
        }

        return merged;
    }
// 1, 3    1,  5
// 2, 4    2 , 3
    public static void main(String[] args){
       int a[][] = { {6,8}, {1,9}, {2,4}, {4,7}  };
        List<MeetingIntervals> meetings = new ArrayList<MeetingIntervals>();
        for(int i =0; i<a.length; i++){
            meetings.add(new MeetingIntervals(a[i][0], a[i][1]));
        }

        Collections.sort(meetings);



        List<MeetingIntervals> result = merge(meetings);

        for(int i =0; i<result.size(); i++){
            System.out.println(result.get(i).startTime + " " + result.get(i).endTime);
        }
    }

}
