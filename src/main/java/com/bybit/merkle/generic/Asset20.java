package com.bybit.merkle.generic;

import lombok.Getter;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public enum Asset20 {
    AGLA((short) 1, 8, RoundingMode.DOWN, true),
    APT((short) 2, 8, RoundingMode.DOWN, true),
    ATOM((short) 3, 8, RoundingMode.DOWN, true),
    AVAX((short) 4, 8, RoundingMode.DOWN, true),
    BIT((short) 5, 8, RoundingMode.DOWN, true),
    BTC((short) 6, 8, RoundingMode.DOWN, true),
    BUSD((short) 7, 8, RoundingMode.DOWN, true),
    DAI((short) 8, 8, RoundingMode.DOWN, true),
    DOGE((short) 9, 8, RoundingMode.DOWN, true),
    DOT((short) 10, 8, RoundingMode.DOWN, true),
    DYDX((short) 11, 8, RoundingMode.DOWN, true),
    EOS((short) 12, 8, RoundingMode.DOWN, true),
    ETH((short) 13, 8, RoundingMode.DOWN, true),
    FTM((short) 14, 8, RoundingMode.DOWN, true),
    LTC((short) 15, 8, RoundingMode.DOWN, true),
    MATIC((short) 16, 8, RoundingMode.DOWN, true),
    SOL((short) 17, 8, RoundingMode.DOWN, true),
    USDC((short) 18, 8, RoundingMode.DOWN, true),
    USDT((short) 19, 8, RoundingMode.DOWN, true),
    XRP((short) 20, 8, RoundingMode.DOWN, true);

    private final short id;
    private final int scale;
    private final RoundingMode mode;
    private final boolean online;

    Asset20(short id, int scale, RoundingMode mode, boolean online) {
        this.id = id;
        this.scale = scale;
        this.mode = mode;
        this.online = online;
    }

    public static List<Asset20> getBalances() {
        return Arrays.stream(values()).filter(Asset20::isOnline).collect(Collectors.toList());
    }
}
