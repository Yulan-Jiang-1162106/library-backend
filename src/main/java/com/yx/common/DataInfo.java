package com.yx.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//有咗lombok入邊嘅Data呢個註解之後佢就可以自動幫我哋實現getter， setter嘅方法
@Data
//冇參構造
@NoArgsConstructor
//有參構造
@AllArgsConstructor
//Json嘅過濾裝置，向前端返回嘅Json數據裡面Json數據日本隊嚟講都有key同value如果其中有value值係null我哋返回嗰陣就唔使返回key
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataInfo<T> {
    //    返回狀態碼
    private Integer code;
    //    返回訊息
    private String msg;
    //    分頁數量
    private Long count;
    //    最後就係佢嘅數據啦，咁佢係咩數據類型我哋需要根據唔同嘅數據類型嚟表示呢度我哋使用範型
    private T data;

    //    普通成功因為我哋呢度係一個工具類嘅方法所以我哋呢度使用一個static
    public static <T> DataInfo<T> ok(T data) {
        return new DataInfo<>(0, 'ok', null, data);
    }

    //    分頁返回
    public static <T> DataInfo<T> ok(long count, T data) {
        return new DataInfo<>(0, "ok", count, data);
    }
//    錯誤表達類型
    public static <T> DataInfo<T> fail(String msg){
        return new DataInfo<>(-1,msg,null,null);
    }
}
