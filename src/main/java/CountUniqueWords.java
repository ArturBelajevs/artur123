import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountUniqueWords {
    public static void main(String[] args) {

        String text = "Regardless of the many languages one is fortunate to be fluent in, English takes its place as one of the world’s predominant forms of communication with its influences extending over as much as +2 billion people globally.\n" +
                "Quirks and inconsistencies aside, the history surrounding its monumental rise is both a fascinating and rich one, and while we promise to be brief, you just might pick up a thing or two that may stimulate your interest in studying English with us here at Oxford International English Schools.\n" +
                "Where it all started\n" +
                "Many of you will be forgiven for thinking that studying an English Language course consists of English grammar more than anything else. While English grammar does play a part when taking courses to improve English overall, it is but a small part of the overall curriculum where one becomes immersed in a history that was partly influenced by myths, battles, and legends on one hand, and the everyday workings of its various social class on the other.\n" +
                "According to the Encyclopedia Britannica, the English language itself really took off with the invasion of Britain during the 5th century. Three Germanic tribes, the Jutes, Saxons and Angles were seeking new lands to conquer, and crossed over from the North Sea. It must be noted that the English language we know and study through various English language courses today had yet to be created as the inhabitants of Britain spoke various dialect of the Celtic language.\n" +
                "During the invasion, the native Britons were driven north and west into lands we now refer to as Scotland, Ireland, and Wales. The word England and English originated from the Old English word Engla-land, literally meaning “the land of the Angles” where they spoke Englisc.\n" +
                "Old English (5th to 11th Century)\n" +
                "Albert Baugh, a notable English professor at the University of Pennsylvania notes amongst his published works that around 85% of Old English is no longer in use; however, surviving elements form the basis of the Modern English language today.\n" +
                "Old English can be further subdivided into the following:\n" +
                "•\tPrehistoric or Primitive (5th to 7th Century) – available literature or documentation referencing this period is not available aside from limited examples of Anglo-Saxon runes;\n" +
                "•\tEarly Old English (7th to 10th Century) – this period contains some of the earliest documented evidence of the English language, showcasing notable authors and poets like Cynewulf and Aldhelm who were leading figures in the world of Anglo-Saxon literature.\n" +
                "•\tLate Old English (10th to 11th Century) – can be considered the final phase of the Old English language which was brought about by the Norman invasion of England. This period ended with the consequential evolution of the English language towards Early Middle English.\n" +
                "Early Middle English\n" +
                "It was during this period that the English language, and more specifically, English grammar, started evolving with particular attention to syntax. Syntax is “the arrangement of words and phrases to create well-formed sentences in a language,” and we find that while the British government and its wealthy citizens Anglicised the language, Norman and French influences remained the dominant language until the 14th century.\n" +
                "An interesting fact to note is that this period has been attributed with the loss of case endings that ultimately resulted in inflection markers being replaced by more complex features of the language. Case endings are “a suffix on an inflected noun, pronoun, or adjective that indicates its grammatical function.”\n" +
                "Charles Laurence Barber comments, “The loss and weakening of unstressed syllables at the ends of words destroyed many of the distinctive inflections of Old English.”\n" +
                "Similarly, John McWhorter points out that while the Norsemen and their English counterparts were able to comprehend one another in a manner of speaking, the Norsemen’s inability to pronounce the endings of various words ultimately resulted in the loss of inflectional endings.\n" +
                "This brings to mind a colleague’s lisp and I take to wondering: if this were a few hundred years ago, and we were in medieval Britain, could we have imagined that a speech defect would bring about the amazing changes modern history is now looking back on? Something to ponder…\n" +
                "Refer to the image below for an idea of the changes to the English language during this time frame.\n" +
                "Late Middle English\n" +
                "It was during the 14th century that a different dialect (known as the East-Midlands) began to develop around the London area.\n" +
                "Geoffrey Chaucer, a writer we have come to identify as the Father of English Literature and author of the widely renowned Canterbury Tales, was often heralded as the greatest poet of that particular time. It was through his various works that the English language was more or less “approved” alongside those of French and Latin, though he continued to write up some of his characters in the northern dialects.\n" +
                "It was during the mid-1400s that the Chancery English standard was brought about. The story goes that the clerks working for the Chancery in London were fluent in both French and Latin. It was their job to prepare official court documents and prior to the 1430s, both the aforementioned languages were mainly used by royalty, the church, and wealthy Britons. After this date, the clerks started using a dialect that sounded as follows:\n" +
                "•\tgaf (gave) not yaf (Chaucer’s East Midland dialect)\n" +
                "•\tsuch not swich\n" +
                "•\ttheyre (their) not hir \n" +
                "As you can see, the above is starting to sound more like the present-day English language we know.\n" +
                "If one thinks about it, these clerks held enormous influence over the manner of influential communication, which ultimately shaped the foundations of Early Modern English.\n" +
                "Early Modern English\n" +
                "The changes in the English language during this period occurred from the 15th to mid-17th Century, and signified not only a change in pronunciation, vocabulary or grammar itself but also the start of the English Renaissance.\n" +
                "The English Renaissance has much quieter foundations than its pan-European cousin, the Italian Renaissance, and sprouted during the end of the 15th century. It was associated with the rebirth of societal and cultural movements, and while slow to gather steam during the initial phases, it celebrated the heights of glory during the Elizabethan Age.\n" +
                "It was William Caxton’s innovation of an early printing press that allowed Early Modern English to become mainstream, something we as English learners should be grateful for! The Printing Press was key in standardizing the English language through distribution of the English Bible.\n" +
                "Caxton’s publishing of Thomas Malory’s Le Morte d’Arthur (the Death of Arthur) is regarded as print material’s first bestseller. Malory’s interpretation of various tales surrounding the legendary King Arthur and the Knights of the Round Table, in his own words, and the ensuing popularity indirectly ensured that Early Modern English was here to stay.\n" +
                "It was during Henry the VIII’s reign that English commoners were finally able to read the Bible in a language they understood, which to its own degree, helped spread the dialect of the common folk.\n" +
                "The end of the 16th century brought about the first complete translation of the Catholic Bible, and though it didn’t make a markable impact, it played an important role in the continued development of the English language, especially with the English-speaking Catholic population worldwide.\n" +
                "The end of the 16th and start of the 17th century would see the writings of actor and playwright, William Shakespeare, take the world by storm.\n" +
                "Why was Shakespeare’s influence important during those times? Shakespeare started writing during a time when the English language was undergoing serious changes due to contact with other nations through war, colonisation, and the likes. These changes were further cemented through Shakespeare and other emerging playwrights who found their ideas could not be expressed through the English language currently in circulation. Thus, the “adoption” of words or phrases from other languages were modified and added to the English language, creating a richer experience for all concerned.\n" +
                "It was during the early 17th century that we saw the establishment of the first successful English colony in what was called The New World. Jamestown, Virginia, also saw the dawn of American English with English colonizers adopting indigenous words, and adding them to the English language.\n" +
                "The constant influx of new blood due to voluntary and involuntary (i.e. slaves) migration during the 17th, 18th and 19th century meant a variety of English dialects had sprung to life, this included West African, Native American, Spanish and European influences.\n" +
                "Meanwhile, back home, the English Civil War, starting mid-17th century, brought with it political mayhem and social instability. At the same time, England’s puritanical streak had taken off after the execution of Charles I. Censorship was a given, and after the Parliamentarian victory during the War, Puritans promoted an austere lifestyle in reaction to what they viewed as excesses by the previous regime. England would undergo little more than a decade under Puritan leadership before the crowning of Charles II. His rule, effectively the return of the Stuart Monarchy, would bring about the Restoration period which saw the rise of poetry, philosophical writing, and much more.\n" +
                "It was during this age that literary classics, like those of John Milton’s Paradise Lost, were published, and are considered relevant to this age!\n" +
                "Late Modern English\n" +
                "The Industrial Revolution and the Rise of the British Empire during the 18th, 19th and early 20th-century saw the expansion of the English language.\n" +
                "The advances and discoveries in science and technology during the Industrial Revolution saw a need for new words, phrases, and concepts to describe these ideas and inventions. Due to the nature of these works, scientists and scholars created words using Greek and Latin roots e.g. bacteria, histology, nuclear, biology. You may be shocked to read that these words were created but one can learn a multitude of new facts through English language courses as you are doing now!\n" +
                "Colonialism brought with it a double-edged sword. It can be said that the nations under the British Empire’s rule saw the introduction of the English language as a way for them to learn, engage, and hopefully, benefit from “overseas” influence. While scientific and technological discoveries were some of the benefits that could be shared, colonial Britain saw this as a way to not only teach their language but impart their culture and traditions upon societies they deemed as backward, especially those in Africa and Asia.\n" +
                "The idea may have backfired as the English language walked away with a large number of foreign words that have now become part and parcel of the English language e.g. shampoo, candy, cot and many others originated in India!\n" +
                "English in the 21st Century\n" +
                "If one endevours to study various English language courses taught today, we would find almost no immediate similarities between Modern English and Old English. English grammar has become exceedingly refined (even though smartphone messaging have made a mockery of the English language itself) where perfect living examples would be that of the current British Royal Family. This has given many an idea that speaking proper English is a touch snooty and high-handed. Before you scoff, think about what you have just read. The basic history and development of a language that literally spawned from the embers of wars fought between ferocious civilisations. Imagine everything that our descendants went through, their trials and tribulations, their willingness to give up everything in order to achieve freedom of speech and expression.\n" +
                "Everything has lead up to this point where English learners decide to study the language at their fancy, something we take for granted as many of us have access to courses to improve English at the touch of a button!\n" +
                "Perhaps you’re a fan of Shakespeare, maybe you’re more intune with John Milton or J.K. Rowling? Whatever you fancy, these authors, poets and playwrights bring to life more than just words on a page. With them comes a living history that continues to evolve to this day!\n" +
                "\n";
        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        String[] words = text.split(" ");

        for (String word : words) {
            System.out.println(word);

        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<String, Integer>();
        bookUniqueWords.put("the", 1);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey()); // otvet the student is
        }
    }
}

/* привет тут скорее так:
1. убираем из текста знаки припинания
2. делим текст на слова
3. обходим каждое слово и добавляем его в хэшмап
4. .... и тд... в таком стиле :)

transient Node < K, V> [] table – сама хеш-таблица, реализованная на основе массива, для хранения пар «ключ-значение» в виде узлов. Здесь хранятся наши Node;*/

//test
