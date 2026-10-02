int piezoPin = A0;     // Piezo sensor pin
int alertPin = 3;      // LED or buzzer pin
int value = 0;

void setup() {
  Serial.begin(9600);
  pinMode(alertPin, OUTPUT);
}

void loop() {
  value = analogRead(piezoPin);   // Read piezo signal
  Serial.println(value);          // Print values

  // Fall detection threshold
  if (value > 500) {   
    digitalWrite(alertPin, HIGH);  // Turn ON LED/Buzzer
    delay(1000);                   // Keep it ON for 1 sec
    digitalWrite(alertPin, LOW);   // Turn OFF
  }

  delay(100);
}
