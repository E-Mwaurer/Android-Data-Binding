
@BindingAdapter("submitWord")
fun Button.setOnSubmitListener(word: DomainWord?) {
    word?.let {
        setOnClickListener { it ->
         text = resources.getString(R.string.word_meaning_output, it.word, it.meaning)
        }
    }
}

@BindingAdapter("setWordText")
fun TextView.setOutputString(item: DomainWord?) {
    item?.let {
        text = resources.getString(R.string.word_meaning_output, it.word, it.meaning)
    }
}
