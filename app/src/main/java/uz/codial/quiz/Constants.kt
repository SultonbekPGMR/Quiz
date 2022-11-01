package uz.codial.quiz


object Constants {
    fun getQuestions(index: Int): ArrayList<Question> {
        when (index) {
            0 -> return geography()
            1 -> return history()
            2 -> return science()
            3 -> return solar()
            4 -> return animal()
            5 -> return math()
            6 -> return general()
        }
        return general()
    }

    private fun math(): ArrayList<Question> {
        var questions = ArrayList<Question>()



        return questions
    }

    private fun animal(): ArrayList<Question> {
        var questions = ArrayList<Question>()



        return questions
    }

    private fun solar(): ArrayList<Question> {
        var questions = ArrayList<Question>()



        return questions
    }

    private fun science(): ArrayList<Question> {
        var questions = ArrayList<Question>()

        questions.add(
            Question(
                "What’s the boiling point of water?",
                "90 C°",
                "100 C°",
                "110 C°",
                "150 C°",
                1
            )
        )

        questions.add(
            Question(
                "Animals that eat both plants and meat are called what?",
                "Badgers",
                "Catfish",
                "Omnivores",
                "grassers",
                2
            )
        )
        questions.add(
            Question(
                "Diabetes develops as the result of a problem with which specific organ in the body?",
                "Pancreas",
                "lung",
                "Liver",
                "Kidney",
                0
            )
        )
        questions.add(
            Question(
                "How long does a human red blood cell survive?",
                "100 days",
                "3 days",
                "24 days",
                "120 days",
                3
            )
        )
        questions.add(
            Question(
                "How many elements are there in the periodic table?",
                "119",
                "118",
                "120",
                "117",
                1
            )
        )
        questions.add(
            Question(
                "Where can you find the smallest bone in the human body?",
                "finger",
                "mouth",
                "nose",
                "ear",
                3
            )
        )
        questions.add(
            Question(
                "The oldest living tree is 4,843 years old and can be found where?",
                "Russian",
                "USA",
                "Canada",
                "Africa",
                1
            )
        )
        questions.add(
            Question(
                "What is the hardest known natural material?",
                "Metal",
                "Gold",
                "glass",
                "Diamonds",
                3
            )
        )
        questions.add(
            Question(
                "What is the scientific term for peeling skin?",
                "Refraction",
                "Desquamation",
                "Diffusion",
                "Sonorus",
                1
            )
        )
        questions.add(
            Question(
                "Most of a penny is made from what type of metal?",
                "Zinc",
                "Aluminum",
                "Steel",
                "Magnesium",
                0
            )
        )
        questions.add(
            Question(
                "Bright’s Disease affects what part of the body?",
                "Heart",
                "brain",
                "Kidney",
                "Foot",
                2
            )
        )


        return questions
    }

    private fun history(): ArrayList<Question> {
        var questions = ArrayList<Question>()

        questions.add(
            Question(
                "When did the construction of the Great Wall of China begin?",
                "7th century BC",
                "3th century",
                "8th century BC",
                "2th century BC",
                0
            )
        )

        questions.add(
            Question(
                "Who sent Christopher Columbus to explore the New World?",
                "son of Fernand",
                "King of France",
                "his wife",
                "King Ferdinand",
                3
            )
        )
        questions.add(
            Question(
                "What is considered the largest empire in history?",
                "Russian",
                "Mongol",
                "British",
                "Roman",
                2
            )
        )
        questions.add(
            Question(
                "What year did the French Revolution start?", "1878", "1789", "1897", "1798", 1
            )
        )
        questions.add(
            Question(
                "In what year did Libya gain independence from Italy?",
                "1923",
                "1935",
                "1951",
                "1953",
                2
            )
        )
        questions.add(
            Question(
                "Where did Albert Einstein live before moving to the United States?",
                "Russia",
                "France",
                "England",
                "Germany",
                3
            )
        )
        questions.add(
            Question(
                "How old was Queen Elizabeth II when she was crowned the Queen of England?",
                "22",
                "31",
                "27",
                "18",
                2
            )
        )

        questions.add(
            Question(
                " What year did India gain independence from Britain?",
                "1947",
                "1945",
                "1941",
                "1948",
                0
            )
        )
        questions.add(
            Question(
                "Who fought in the Hundred Years’ War?",
                "Germany and Russia",
                "Britain and France",
                "Japan and China",
                "France and Russia",
                1
            )
        )
        questions.add(
            Question(
                "Which country hosted the 2016 Olympics?",
                "Brazil",
                "Russia",
                "Japan",
                "France",
                0
            )
        )




        return questions
    }


    private fun geography(): ArrayList<Question> {
        var questions = ArrayList<Question>()
        questions.add(
            Question(
                "Which country has the largest population in the world?",
                "USA",
                "China",
                "Russia",
                "India",
                1
            )
        )
        questions.add(
            Question(
                "What is the name of the longest river in Africa?",
                "Amazon",
                "Congo",
                "Nile",
                "Yangtze",
                2
            )
        )
        questions.add(
            Question(
                "What American city is the Golden Gate Bridge located in?",
                "New York",
                "Washington",
                "Florida",
                "San Francisco",
                3
            )
        )
        questions.add(
            Question(
                "What country has the most natural lakes?",
                "Canada",
                "Japan",
                "Russia",
                "Australia",
                0
            )
        )
        questions.add(
            Question(
                "What country lies above Mexico?", "USA", "Brazil", "Canada", "Argentina", 0
            )
        )

        questions.add(
            Question(
                "What country formerly ruled Iceland?", "Sweden", "Denmark", "Norway", "Finland", 1
            )
        )

        questions.add(
            Question(
                "What is the name of the largest airport in the United States of America?",
                "Denver",
                "Orlando",
                "Dullas",
                "Washington",
                0
            )
        )
        questions.add(
            Question(
                "What country is known to have the best quality tap water?",
                "Sweden",
                "Germany",
                "Canada",
                "Switzerland",
                3
            )
        )
        questions.add(
            Question(
                "In what ocean is the Bermuda Triangle located?",
                "pacific",
                "Indian",
                "Arctic",
                "Atlantic",
                3
            )
        )
        questions.add(
            Question(
                "How many stars are on the Australian flag?", "10", "6", "3", "12", 1
            )
        )

        return questions
    }


    private fun general(): ArrayList<Question> {
        var questions = ArrayList<Question>()
        questions.add(
            Question(
                "What is the most popular name in the world?", "Muhammad", "David", "Jack", "Tom", 0
            )
        )
        questions.add(
            Question(
                "When the first computer was invented? ",
                "in 1960",
                "in 1950",
                "in 1940",
                "in 1970",
                2
            )
        )
        questions.add(
            Question(
                "What color was the Coca-Cola originally?",
                "Yellow",
                "Black",
                "Transparent",
                "Green",
                3
            )
        )
        questions.add(
            Question(
                "how many percent of their taste buds people lose during flight? ",
                "50",
                "up to 30%",
                "less than 10%",
                "0%",
                1
            )
        )
        questions.add(
            Question(
                "A bolt of lightning is can be five times hotter than what?",
                "fire",
                "sun",
                "lava",
                "boiling water",
                1
            )
        )
        questions.add(
            Question(
                "The energy hurricane releases in one second is equal to how many atomic bombs?",
                "1",
                "10",
                "100",
                "1000",
                1
            )
        )
        questions.add(
            Question(
                "Only one planet spins clockwise. Which planet is that?",
                "Venus",
                "Mercury",
                "Mars",
                "Earth",
                0
            )
        )
        questions.add(
            Question(
                "How many Earths could fit inside the sun?",
                "100",
                "100000",
                "1000000",
                "10000000",
                2
            )
        )
        questions.add(
            Question(
                "The footprints on the moon will be there for how many million year?",
                "1",
                "10",
                "100",
                "11",
                2
            )
        )
        questions.add(
            Question(
                "It takes how many minutes for light to travel from sun to earth?",
                "1",
                "30",
                "19",
                "8",
                3
            )
        )
        questions.add(
            Question(
                "Which planet is the fastest spinning planet in the solar system?",
                "Earth",
                "Mars",
                "Jupiter",
                "Venus",
                2
            )
        )
        questions.add(
            Question(
                "The Earth's core is as hot as What?",
                "lava",
                "light",
                "boiling water",
                "surface of the sun",
                3
            )
        )
        questions.add(
            Question(
                "When the first animals were sent to space?", "1947", "1927", "1950", "1932", 0
            )
        )
        questions.add(
            Question(
                "One day on Venus is equals to how many months on Earth?", "1", "5", "8", "10", 2
            )
        )
        questions.add(
            Question(
                "There are more stars in the universe than something on Earth? What is it",
                "grains of sands",
                "trees",
                "people",
                "ants",
                0
            )
        )
        questions.add(
            Question(
                "Which animal's brain goes to sleep only half of it and the other half stays awake?",
                "bear",
                "shark",
                "eagle",
                "dolphins",
                3
            )
        )
        questions.add(
            Question(
                "what is the largest living animal?",
                "elephant",
                "blue whale",
                "snake",
                "gorilla",
                1
            )
        )
        questions.add(
            Question(
                "Which animal's eye is bigger than its brain? ",
                "elephant",
                "blue whale",
                "ostrich",
                "gorilla",
                2
            )
        )
        questions.add(
            Question(
                "How many smells human nose can detect? ",
                "thousand",
                "million",
                "milliard",
                "trillion",
                3
            )
        )
        questions.add(
            Question(
                "What is the strongest muscle in the body?",
                "Biceps",
                "Quadriceps",
                "Tongue",
                "Triceps",
                2
            )
        )
        questions.add(
            Question(
                "Which animal's teeth are strong as human teeth? ",
                "shark",
                "tiger",
                "bear",
                "dog",
                0
            )
        )
        questions.add(
            Question(
                "Which animal can hold its pee for up to eight months? ",
                "snake",
                "camel",
                "frog",
                "eagle",
                2
            )
        )
        questions.add(
            Question(
                "By whom Cotton candy was invented? ", "cooker", "dentist", "baker", "driver", 1
            )
        )


        return questions

    }

}