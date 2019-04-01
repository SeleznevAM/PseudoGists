override fun restoreAd() {
        GlobalScope.launch(Main) {
            val view = viewDeferred.await() ?: return@launch
            if ((view as View).parent != null) ((view as View).parent as? ViewGroup)?.removeView(view as View)
            adSettings().inlineView().addView(view as View)
            view.play()
        }

    }
