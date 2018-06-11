int led = 13;
char data;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(led, OUTPUT);
  digitalWrite(led, LOW);
  
}

void loop() {
  // put your main code here, to run repeatedly:
  if(Serial.available() > 0){
    data = Serial.read();

    switch(data){
      case '0':
        digitalWrite(led, LOW);
        break;
      case '1':
        digitalWrite(led, HIGH);
        break;
    }
  }
}
