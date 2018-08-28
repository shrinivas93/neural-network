package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class SoftPlusFunction implements ActivationFunction {

    @Override
    public Double calculate(Double input) {
        return Math.log(1 + Math.exp(input));
    }

}
