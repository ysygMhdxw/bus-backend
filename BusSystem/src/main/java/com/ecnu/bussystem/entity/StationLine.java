package com.ecnu.bussystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationLine implements Comparable{
    private String name;
    private Boolean directional;
    private List<Station> stations;

    @Override
    public int compareTo(Object o) {
        StationLine stationLine=(StationLine) o;
        if(this.getName().compareTo(stationLine.getName())>0)
            return 1;
        else  return -1;
    }

}
