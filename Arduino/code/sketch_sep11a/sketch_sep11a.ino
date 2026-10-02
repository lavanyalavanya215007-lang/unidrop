int sensorPin = A0;
int sensorValue = 0;

// Digital control pins
int digit1 = 2;
int digit2 = 3;
//int digit3 = 11;

byte digits[10][7]={
  {1,1,1,1,1,1,0},
  {0,1,1,0,0,0,0},
  {1,1,0,1,1,0,1},
  {1,1,1,1,0,0,1},
  {0,1,1,0,0,1,1},
  {1,0,1,1,0,1,1},
  {1,0,1,1,1,1,1},
  {1,1,1,0,0,0,0},
  {1,1,1,1,1,1,1},
  {1,1,1,1,0,1,1}
};

int seg[] = {13,12,11,10,9,8,7,6};

void setup() {
  Serial.begin(9600);

  for(int i=0; i<7; i++) pinMode(seg[i], OUTPUT);

  pinMode(digit1, OUTPUT);
  pinMode(digit2, OUTPUT);

  digitalWrite(digit1, HIGH);
  digitalWrite(digit2, HIGH);
}

void loop() {
  sensorValue = analogRead(sensorPin);
  float voltage = (sensorValue*5.0)/1023.0;
  Serial.println(voltage);
  int vol=int(voltage*10);

  int a = vol/10;
  int b= vol%10;

  displayDigit(a, digit1,true);
  displayDigit(b, digit2,false);
  
}

void displayDigit(int num, int digitPin, bool dp) {

  clear();
  digitalWrite(digitPin, LOW);
  digitalWrite(6, dp ? 1:0);

  for(int i=0;i<7;i++)
  {
    digitalWrite(seg[i], digits[num][i]);
  }

  delay(5);
    digitalWrite(digitPin, HIGH);

}

void clear(){
  for(int i=0;i<7;i++)
  digitalWrite(seg[i],0);

}
