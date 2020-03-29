--create database telegram;

create table city
(
    id          serial primary key ,
    city_name    varchar(100),
    description varchar(1000)
);

insert into city( city_name, description)
values
       ( 'Moscow', 'the capital and largest city of Russia. Many paths and human destinies lead here, many fateful and' ||
                     ' significant events of history, human joys and hopes, misfortunes and disappointments, and, of ' ||
                     'course, legends, myths and legends are connected with this city. Moscow is a brilliant city, ' ||
                     'worthy of being called the capital in all respects. There are magnificent architectural monuments' ||
                     ' and picturesque parks, the best shops and high skyscrapers, a long metro and crowded train ' ||
                     'stations. Moscow never sleeps, they work here from morning until late at night, and then have' ||
                     ' fun until morning.'),
       ( 'Kiev', 'the capital of Ukraine; a city on the hills, bearing the title of Hero. It stretches on two sides of' ||
                   ' the main water main of the country – the Dnipro river. It is the largest scientific, industrial, ' ||
                   'cultural and religious center of the state. It is one of the ten largest cities in Europe, and its ' ||
                   'history goes back more than 2500 years.'),
       ( 'Paris', ' the capital of France, the most beautiful and elegant city in the world, a symbol of love and ' ||
                    'romance, fashion and sophistication. There is no such person who would not dream of visiting Paris,' ||
                    ' seeing the sights that have become textbook, to plunge into the atmosphere of relaxation, to pay ' ||
                    'tribute to French cuisine, to wander along the beautiful boulevards. Paris has everything that ' ||
                    'travelers dream of – numerous museums with the richest collections, excellent shopping, entertainment' ||
                    ' for every taste'),
       ( 'Berlin', 'a special city. Here in may 1945, after the bloodiest war in history, fascism was defeated and the' ||
                     ' banner of Victory was raised. A city with great ambitions, a failed world capital "cut off" by the' ||
                     ' so – called wall of Shame for 28 years-all these titles have long been part of history for modern' ||
                     ' Berlin. Today, the second most populous city in the European Union has other features. Of course,' ||
                     ' the harsh past is not completely forgotten, but it is no longer so striking, which is why the ' ||
                     'appearance of the capital of Germany only gained.'),
       ( 'Minsk', 'the capital of the Republic of Belarus, its industrial, cultural and scientific center. The city' ||
                    ' is located in the Central part of the country, on the banks of the Svisloch river. Minsk is one ' ||
                    'of the oldest European cities with a huge cultural heritage and rich traditions. It surprises with' ||
                    ' a combination of medieval and Soviet architecture, its well-groomed and unhurried. It is worth ' ||
                    'coming here to get acquainted with the heroic past of the city, visit its museums, temples, ' ||
                    'churches and ancient estates.'),
       ( 'New York', 'perhaps the most famous city in the world, which is home to financial institutions, numerous ' ||
                       'historical and cultural attractions, museums, shops, theaters, and more. This is a noisy and ' ||
                       'bright city of skyscrapers and freedom, which is familiar to many from the abundance of movies ' ||
                       'and photos where the action takes place on its streets. There are as many possibilities as you' ||
                       ' can imagine. From times square to the darkest corner of the Bronx, it''s a land of extremes.' ||
                       ' From the Russian enclave in Brooklyn on Brighton beach to the South American branch in ' ||
                       'Queens-communities from any country in the world.'),
       ( 'Vilnius', 'the capital and largest metropolis of Lithuania, one of the most beautiful cities not only in the' ||
                      ' Baltic States, but also in Europe. It is located in the extreme South-East of the country, in a ' ||
                      'surprisingly beautiful place where the Vilnya and Neris rivers merge, near the border with neighboring' ||
                      ' Belarus. About 40% of the total area of Vilnius is covered by green spaces, which makes it one ' ||
                      'of the most "green" cities on the continent with a favorable environmental situation.')