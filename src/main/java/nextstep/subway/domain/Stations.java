package nextstep.subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Stations {
    private final List<Station> stations;

    public Stations(Station station) {
        this.stations = new ArrayList<>();
        this.stations.add(station);
    }

    public Stations(List<Station> stations) {
        this.stations = new ArrayList<>(stations);
    }
}
