package entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Created by framgia on 18/09/2017.
 */

@Getter
@Setter
public class Price {
    private String codeId;
    private Double price;
    private Double volumn;
    private Double circulatingSupply;
    private Double marketCap;
    private Double percent1Hour;
    private Double percent24Hours;
    private Double percent7Days;
    private Timestamp regTime;
    private Timestamp updTime;
}
