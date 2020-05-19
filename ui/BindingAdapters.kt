
@BindingAdapter("onSubmitWord")
fun Button.setOnSubmitListener(word: DomainWord?) {
    word?.let {
        setOnClickListener { it ->
             
        }
    }
}

@BindingAdapter("setOutputString")
fun TextView.setOutputString(item: DomainWord?) {
    item?.let {
        text = resources.getString(R.string.event_timeline_text, it.word, it.meaning)
    }
}
