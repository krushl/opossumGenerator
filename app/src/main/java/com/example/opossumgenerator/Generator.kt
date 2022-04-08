package com.example.opossumgenerator

var opossumName : List<String> = listOf("Vasya","Petya","Yarik","Sasha","Masha", "Valya","Nikita","NEGR");
var opossumImg = listOf(
    R.drawable.bolnoy,
    R.drawable.bolnoy2,
    R.drawable.dima,
    R.drawable.niga,
    R.drawable.oleg,
    R.drawable.osen,
    R.drawable.richard,
    R.drawable.tojeya,
    R.drawable.vasya,
    R.drawable.ya,
    R.drawable.rico,
);


class Generator() {
    fun generateList(minValue: Int, maxValue: Int): MutableList<Opossum> {
        val opossumCrowd: MutableList<Opossum> = mutableListOf();
        val count = (minValue..maxValue).random();
        for (n in (1..6))
        {
            val name: String = opossumName.get((1..7).random())
            val height: Int = (15..40).random()
            val weight: Int = (10..60).random()
            val strength: Int = (10..99).random()
            val mind: Int = (0..999).random()
            val image: Int = opossumImg.get((1..10).random())

            opossumCrowd.add(Opossum(name,height,weight,strength,mind,image));
        }
        return opossumCrowd;
    }
}

