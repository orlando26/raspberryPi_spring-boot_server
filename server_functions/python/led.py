from time import sleep
import serial
import sys

val = sys.argv[1] # prints var1

ser = serial.Serial('/dev/ttyACM1', 9600) # Establish the connection on a specific port

if val == 'on':
    ser.write('1'.encode()) 

if val == 'off':
    ser.write('0'.encode()) 
