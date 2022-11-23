const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '28ca9e41f4msh0a7cc03115bcc91p135a40jsne709641fb97c',
		'X-RapidAPI-Host': 'spoonacular-recipe-food-nutrition-v1.p.rapidapi.com'
	}
};

fetch('https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/guessNutrition?title=Spaghetti%20Aglio%20et%20Olio', options)
	.then(response => response.json())
	.then(response => console.log(response))
	.catch(err => console.error(err));