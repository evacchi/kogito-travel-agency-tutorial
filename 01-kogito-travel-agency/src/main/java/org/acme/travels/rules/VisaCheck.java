package org.acme.travels.rules;

import org.acme.travels.Traveller;
import org.acme.travels.Trip;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

public class VisaCheck implements RuleUnitData {
    DataStore<Trip> trip = DataSource.createStore();
    DataStore<Traveller> traveller = DataSource.createStore();

    /**
     * @return the trips
     */
    public DataStore<Trip> getTrip() {
        return trip;
    }

    /**
     * @return the travellers
     */
    public DataStore<Traveller> getTraveller() {
        return traveller;
    }
}