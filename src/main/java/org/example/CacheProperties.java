package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CacheProperties {
    private int maximumSize;
    private int initialCapacity;

    public static CacheProperties defaultProperties() {
       return new CacheProperties(1000, 10000);
    }
}
