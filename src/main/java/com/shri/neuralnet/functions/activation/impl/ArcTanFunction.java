package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class ArcTanFunction implements ActivationFunction {

    @Override
    public Double calculate(Double input) {
        return Math.atan(input);
    }

}
