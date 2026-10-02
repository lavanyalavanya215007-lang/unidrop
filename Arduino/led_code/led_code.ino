void setup() {
  pinMode(13, OUTPUT);
  pinMode(11, INPUT);
}

void loop() {
  if(digitalRead(11)==0)
  {
    digitalWrite(13, HIGH);
  }
  else
  {
    digitalWrite(13, LOW);
  }

}
