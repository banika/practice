package interview;

import java.time.LocalDate;
//import java.time.LocalDate;
import java.util.*;

/**
 * Created by banindita on 6/5/2017.
 */
public class RatePeriodInterview {
    public static class RatePeriod{
        public LocalDate startDate;
        public LocalDate endDate;
        public double nightlyRate;
    }
/*
    public List<RatePeriod> resolveOverlappingRatePeriods(final List<RatePeriod> rp){
        Collections.sort(rp, new Comparator<RatePeriod>() {
            @Override
            public int compare(RatePeriod period1, RatePeriod period2){

                return period1.startDate.compareTo(period2.startDate);
            }
        });

        for(int i =0;i<rp.size();i++){

        }
    }

    RatePeriod overlapPeriod(RatePeriod A, RatePeriod B ){
        List<RatePeriod> rp = new ArrayList<>();
        if(A.endDate.isAfter(B.startDate)){
            if(A.nightlyRate < B.nightlyRate){
                RatePeriod newPeriod = RatePeriod.
                rp.add(B);
            }
        }
    }
    */
}
