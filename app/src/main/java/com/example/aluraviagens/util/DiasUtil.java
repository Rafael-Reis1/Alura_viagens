package com.example.aluraviagens.util;

import androidx.annotation.NonNull;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    @NonNull
    public static String formataEmTexto(int quantDeDias) {
        if (quantDeDias > 1)
        {
            return(quantDeDias + PLURAL);
        }
            return(quantDeDias + SINGULAR);
    }
}
