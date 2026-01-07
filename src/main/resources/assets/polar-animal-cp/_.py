from PIL import Image


def resize_big(img: Image.Image, scale: int):
	load = img.load()
	new_img = Image.new('RGBA', (img.width * scale, img.height * scale))
	for x in range(img.width):
		for y in range(img.height):
			for dx in range(scale):
				for dy in range(scale):
					new_img.putpixel((x * scale + dx, y * scale + dy), load[x, y])
	return new_img


def resize_small(img: Image.Image, scale: int):
	load = img.load()
	if img.width % scale or img.height % scale:
		raise '不行!'
	new_img = Image.new('RGBA', (img.width // scale, img.height // scale))
	for x in range(img.width // scale):
		for y in range(img.height // scale):
			pixel = (0,) * len(load[0, 0])
			div_num = 0
			for dx in range(scale):
				for dy in range(scale):
					new_pixel = load[x * scale + dx, y * scale + dy]
					if new_pixel[0] == new_pixel[1] == new_pixel[2] == 255:
						continue
					pixel = tuple(i + j for i, j in zip(pixel, new_pixel))
					div_num += 1
			if div_num:
				pixel = tuple(round(i / div_num) for i in pixel)
				new_img.putpixel((x, y), pixel)
	return new_img


def raw(img: Image.Image):
	img_load = img.load()
	new = Image.new('RGBA', (16, 16))
	for x in range(img.width):
		for y in range(img.height):
			color = img_load[x, y]
			if color == (255, 255, 255, 255):
				continue
			new.putpixel(
				(x, y),
				(
					int(255 - (255 - color[0]) * .7),
					int(color[1] * .95),
					int(color[2]),
					color[3]
				)
			)
	return new


def cooked(img: Image.Image):
	img_load = img.load()
	new = Image.new('RGBA', (16, 16))
	for x in range(img.width):
		for y in range(img.height):
			color = img_load[x, y]
			if color == (255, 255, 255, 255):
				continue
			new.putpixel(
				(x, y),
				(
					int(color[0] * .89),
					int(color[1] * .85),
					int(color[2] * .66),
					color[3]
				)
			)
	return new


old = Image.open('_ 4th.png')
cooked(old).save('_ 4th_2.png')
# raw(old).show()
