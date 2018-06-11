#!/bin/bash

#------------------Variables declaration--------------
directory=~/server_functions/python


#------------------Python Functions call--------------
function led_function {
    program=$directory/led.py
    echo "led_function running..."
    python $program $1
}


#------------------Main program starts here-----------

function=$1


if [ "$function" = "led" ]
then
    val=$2
    led_function $val 
fi