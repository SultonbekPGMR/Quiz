package uz.codial.quiz




object Constants {
    fun getQuestions(): ArrayList<Question> {
        var questions = ArrayList<Question>()
        questions.add(Question("What is the most popular name in the world?", "Muhammad", "David", "Jack", "Tom", 0))
        questions.add(Question("When the first computer was invented? ", "in 1960", "in 1950", "in 1940", "in 1970", 2))
        questions.add(Question("What color was the Coca-Cola originally?", "Yellow", "Black", "Transparent", "Green", 3))
        questions.add(Question("how many percent of their taste buds people lose during flight? ", "50", "up to 30%", "less than 10%", "0%", 1))
        questions.add(Question("A bolt of lightning is can be five times hotter than what?", "fire", "sun", "lava", "boiling water", 1))
        questions.add(Question("The energy hurricane releases in one second is equal to how many atomic bombs?", "1", "10", "100", "1000", 1))
        questions.add(Question("Only one planet spins clockwise. Which planet is that?", "Venus", "Mercury", "Mars", "Earth", 0))
        questions.add(Question("How many Earths could fit inside the sun?", "100", "100000", "1000000", "10000000", 2))
        questions.add(Question("The footprints on the moon will be there for how many million year?", "1", "10", "100", "11", 2))
        questions.add(Question("It takes how many minutes for light to travel from sun to earth?", "1", "30", "19", "8", 3))
        questions.add(Question("Which planet is the fastest spinning planet in the solar system?", "Earth", "Mars", "Jupiter", "Venus", 2))
        questions.add(Question("The Earth's core is as hot as What?", "lava", "light", "boiling water", "surface of the sun", 3))
        questions.add(Question("When the first animals were sent to space?", "1947", "1927", "1950", "1932", 0))
        questions.add(Question("One day on Venus is equals to how many months on Earth?", "1", "5", "8", "10", 2))
        questions.add(Question("There are more stars in the universe than something on Earth? What is it", "grains of sands", "trees", "people", "ants", 0))
        questions.add(Question("Which animal's brain goes to sleep only half of it and the other half stays awake?", "bear", "shark", "eagle", "dolphins", 3))
        questions.add(Question("what is the largest living animal?", "elephant", "blue whale", "snake", "gorilla", 1))
        questions.add(Question("Which animal's eye is bigger than its brain? ", "elephant", "blue whale", "ostrich", "gorilla", 2))
        questions.add(Question("How many smells human nose can detect? ", "thousand", "million", "milliard", "trillion", 3))
        questions.add(Question("What is the strongest muscle in the body?", "Biceps", "Quadriceps", "Tongue", "Triceps", 2))
        questions.add(Question("Which animal's teeth are strong as human teeth? ", "shark", "tiger", "bear", "dog", 0))
        questions.add(Question("Which animal can hold its pee for up to eight months? ", "snake", "camel", "frog", "eagle", 2))
        questions.add(Question("By whom Cotton candy was invented? ", "cooker", "dentist", "baker", "driver", 1))


        return questions
    }
}