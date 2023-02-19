fun main(){
   print('BMI Calculator')
    height = eval(input('Enter your height in inches; '))
    weight = eval(input('Enter your weight in pounds:))

    bmi = weight * 703 / height * height
        if bmi >= 18.5 and bmi <= 25:
            print("You have an optimal weight")
        elif bmi < 18.5
                print("You are underweight")
        else bmi > 25
                print("You are overweight")
}
