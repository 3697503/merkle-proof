package com.bybit.merkle.generic;

import com.bybit.util.CryptoUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

@EqualsAndHashCode(callSuper = true)
@Data
public class Self<T extends Balance> extends Path<T> {
    private String userHash;

    public boolean validate(){
        String data = userHash + balance.concatBalances();
        String calculatedHash = CryptoUtil.sha256Str(data);
        return StringUtils.equals(calculatedHash, hash);
    }
}
