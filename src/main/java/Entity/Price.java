package Entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Created by framgia on 18/09/2017.
 */

@Getter
@Setter
public class Price {
    private Double price;
    private Double volumn;
    private Double percent1Hour;
    private Double percent24Hours;
    private Double percen7Days;
    private Timestamp regTime;
    private Timestamp updTime;
}
