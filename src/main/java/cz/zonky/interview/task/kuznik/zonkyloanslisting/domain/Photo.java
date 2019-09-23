package cz.zonky.interview.task.kuznik.zonkyloanslisting.domain;

import lombok.Data;

/**
 * @Data is a convenient lombok shortcut annotation that bundles the features of
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 * More info on setting everything up in here https://www.baeldung.com/lombok-ide .
 */

@Data
public class Photo {

    private String name;
    private String url;

}
