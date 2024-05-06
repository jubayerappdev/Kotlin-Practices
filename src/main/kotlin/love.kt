fun convertToLetterGrade(grade: Int):String{
    return when{
        grade>=90->"A"
        grade>=80->"B"
        grade>=70->"C"
        grade>=60->"D"
        else->"F"

    }
}