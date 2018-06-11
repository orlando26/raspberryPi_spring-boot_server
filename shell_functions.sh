#!/bin/bash

function led_function {
echo "led_function running..."
python led.py $1
}

function=$1

if [ "$function" = "led" ]
then
    led_function $2
fi